package CreationalPattern.BuilderPattern;


class House{
    private String material;
    private String tile;
    private String foundation;

    private boolean hasGarden;
    private boolean hasSwimmingpool;
    private boolean hasBalconi;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasSwimmingpool() {
        return hasSwimmingpool;
    }

    public void setHasSwimmingpool(boolean hasSwimmingpool) {
        this.hasSwimmingpool = hasSwimmingpool;
    }

    public boolean isHasBalconi() {
        return hasBalconi;
    }

    public void setHasBalconi(boolean hasBalconi) {
        this.hasBalconi = hasBalconi;
    }




    ///as you can see that this is a pretty lengthy constructer
    /// and its hard to maintain also if we want another constructer according to
    /// paraams so there would be lot of constrcuter which is wrong
    public House(
            String material,

    String tile,

    String foundation,
    boolean hasGardenm,
    boolean hasSwimmingpool,
    boolean hasBalcon
    ){
        this.foundation = foundation;
        this.tile = tile;
        this.material = material;
        this.hasBalconi = hasBalcon;
        this.hasGarden = hasGardenm;
        this.hasSwimmingpool = hasSwimmingpool;
    }

    @Override
    public String toString() {
        return "House{" +
                "material='" + material + '\'' +
                ", tile='" + tile + '\'' +
                ", foundation='" + foundation + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingpool=" + hasSwimmingpool +
                ", hasBalconi=" + hasBalconi +
                '}';
    }
}


public class WithoutBuilderPattern {
    public static void main(String[] args) {

        //very long
        House house = new House("brick" , "spartex" , " concrete" , false , false , true);

        System.out.println(house);
    }
}
