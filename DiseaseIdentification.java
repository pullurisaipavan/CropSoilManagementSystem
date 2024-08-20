import java.util.HashMap;
import java.util.Map;

public class DiseaseIdentification {

    private Map<String, String> diseases;

    public DiseaseIdentification() {
        diseases = new HashMap<>();
        diseases.put("yellow leaves", "Nitrogen deficiency");
        diseases.put("brown spots", "Fungal infection");
    }

    public void identifyDisease(String symptom) {
        String disease = diseases.get(symptom.toLowerCase());
        if (disease != null) {
            System.out.println("The symptom '" + symptom + "' indicates: " + disease);
        } else {
            System.out.println("Sorry, no information available for this symptom.");
        }
    }
}
