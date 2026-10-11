package CreationalPattern.BuilderPattern;

class House1{
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




// now the whole object is created by builder so we have to make it private
    // so now oither can make object of it
    private House1(
            HouseBuilder builder
    ){
        this.foundation = builder.getFoundation();
        this.tile = builder.getTile();
        this.material = builder.getMaterial();
        this.hasBalconi = builder.isHasBalconi();
        this.hasGarden = builder.isHasGarden();
        this.hasSwimmingpool = builder.isHasSwimmingpool();
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

// amke it static so you can call its method with this House class
   static class HouseBuilder{
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

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public boolean isHasSwimmingpool() {
            return hasSwimmingpool;
        }

        public HouseBuilder setHasSwimmingpool(boolean hasSwimmingpool) {
            this.hasSwimmingpool = hasSwimmingpool;
            return this;
        }

        public boolean isHasBalconi() {
            return hasBalconi;
        }

        public HouseBuilder setHasBalconi(boolean hasBalconi) {
            this.hasBalconi = hasBalconi;
            return this;
        }

        //so this  has all paraams which is neccesary fo rthis and other are optional
      public HouseBuilder(String foundation , String material ,String tile){
            this.foundation = foundation;
            this.material = material;
            this.tile = tile;
      }

      public House1 build(){
            return new House1(this);
      }

    }
}


public class WithBuilderPattern {

    public static void main(String[] args) {
        House1 house = new House1.
                HouseBuilder("Brick" , "concrete" , "Spartext").
                setHasBalconi(true).
                build();

        System.out.println(house);
    }
}
