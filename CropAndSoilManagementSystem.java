import java.util.Scanner;

public class CropAndSoilManagementSystem {

    public static void main(String[] args) {
        CropRecommendation cropRecommendation = new CropRecommendation();
        DiseaseIdentification diseaseIdentification = new DiseaseIdentification();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Crop and Soil Management System");

        // Crop recommendation
        System.out.print("Enter soil type (LOAMY, CLAYEY, SANDY, SILTY): ");
        String soilType = scanner.nextLine();
        cropRecommendation.recommendCrops(SoilType.valueOf(soilType.toUpperCase()));

        // Disease identification
        System.out.print("Enter crop symptom (yellow leaves, brown spots): ");
        String symptom = scanner.nextLine();
        diseaseIdentification.identifyDisease(symptom);

        scanner.close();
    }
}
