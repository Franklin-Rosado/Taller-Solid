public class CloudServicePlatform {
    private ICloudService cloudService;

    // Constructor que acepta una implementación de ICloudService
    public CloudServicePlatform(ICloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void hostingTo(AppWeb app) {
        cloudService.connect();  // Polimorfismo: llamamos al método connect() del proveedor concreto
    }

}

