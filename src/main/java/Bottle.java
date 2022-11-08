public class Liquid {

    private int cupSize;
    private int liquidValue;
    private String cupName;

    public Liquid(int cupSize, int liquidValue, String cupName) {
        this.cupSize = cupSize;
        this.liquidValue = liquidValue;
        this.cupName = cupName;
    }

    public int getCupSize() {
        return cupSize;
    }

    public int getLiquidValue() {
        return liquidValue;
    }

    public String getCupName() {
        return cupName;
    }

    @Override
    public String toString() {
        return cupName;
    }

    public void setCupSize(int cupSize) {
        this.cupSize = cupSize;
    }

    public void setLiquidValue(int liquidValue) {
        this.liquidValue = liquidValue;
    }

    public void setCupName(String cupName) {
        this.cupName = cupName;
    }

    static class LiquidBuilder {

        private int cupSize;

        private String cupName;

        private int liquidValue;

        LiquidBuilder cupSize(int cupSize) {
            this.cupSize = cupSize;
            return this;
        }

        LiquidBuilder cupName(String cupName) {
            this.cupName = cupName;
            return this;
        }

        LiquidBuilder liquidValue(int liquidValue){
            this.liquidValue = liquidValue;
            return this;
        }

        Liquid build() {
            return new Liquid(cupSize, liquidValue, cupName);
        }
    }
}
