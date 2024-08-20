import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropRecommendation {

    private Map<SoilType, List<String>> soilTypes;

    public CropRecommendation() {
        soilTypes = new HashMap<>();
        soilTypes.put(SoilType.LOAMY, List.of("Wheat", "Sugarcane", "Cotton"));
        soilTypes.put(SoilType.CLAYEY, List.of("Rice", "Tomato", "Sunflower"));
        soilTypes.put(SoilType.SANDY, List.of("Millet", "Peanuts", "Carrots"));
        soilTypes.put(SoilType.SILTY, List.of("Vegetables", "Barley", "Soybeans"));
    }

    public void recommendCrops(SoilType soilType) {
        List<String> crops = soilTypes.get(soilType);
        if (crops != null) {
            System.out.println("Recommended crops for " + soilType + " soil: " + String.join(", ", crops));
        } else {
            System.out.println("Sorry, no recommendations for this soil type.");
        }
    }
}
