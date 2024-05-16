package com.pedagio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fatura implements PassagemObserver {

    private final Map<String, Map<String, List<Passagem>>> passagensPorTagData = new HashMap<>();
    private final Map<String, Double> tarifasTag = new HashMap<>();

    public Fatura() {
    }

    @Override
    public void processarPassagem(Passagem passagem) {
        String tag = passagem.getTag();
        LocalDateTime data = LocalDateTime.parse(passagem.getHoraDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));

        // Update map structure
        passagensPorTagData.computeIfAbsent(tag, k -> new HashMap<>())
                .computeIfAbsent(data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), k -> new ArrayList<>())
                .add(passagem);

        tarifasTag.compute(tag, (k, v) -> v == null ? passagem.getValor() : v + passagem.getValor());

        enviarFatura(passagem);
    }

    public void enviarFatura(Passagem p) {
        for (Map.Entry<String, Double> entry : tarifasTag.entrySet()) {
            String tagId = entry.getKey();
            Double valorTotal = entry.getValue();
            System.out.println("Tag ID: " + tagId + ", Valor Total: " + valorTotal);
        }
    }

    public Double getValorTotalTag(String tag) {
        if (tarifasTag.containsKey(tag)) {
            return tarifasTag.get(tag);
        } else {
            return 0.0;
        }
    }

    public List<Passagem> getPassagensPorTagEData(String tag, String data) {
        Map<String, List<Passagem>> dataMap = passagensPorTagData.get(tag);
        if (dataMap != null) {
            return dataMap.get(data);
        } else {
            return new ArrayList<>(); // Return empty list if no data found
        }
    }
}
