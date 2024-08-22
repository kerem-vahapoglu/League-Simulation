public class Player {
    private String name;
    private String position; // "Hücum", "Orta Saha", "Savunma", "Kaleci"
    private int physical;
    private int mental;
    private int technical;
    private int goalkeeping;

    // Pozisyon bazlı özellikler
    private int tackling;       // Savunma için
    private int marking;        // Savunma için
    private int passing;        // Orta Saha için
    private int dribbling;      // Orta Saha için
    private int finishing;      // Hücum için
    private int heading;        // Hücum için
    private int reflexes;       // Kaleci için
    private int handling;       // Kaleci için

    // Constructor
    public Player(String name, String position, int physical, int mental, int technical, int goalkeeping,
                  int tackling, int marking, int passing, int dribbling,
                  int finishing, int heading, int reflexes, int handling) {
        this.name = name;
        this.position = position;
        this.physical = physical;
        this.mental = mental;
        this.technical = technical;
        this.goalkeeping = goalkeeping;
        this.tackling = tackling;
        this.marking = marking;
        this.passing = passing;
        this.dribbling = dribbling;
        this.finishing = finishing;
        this.heading = heading;
        this.reflexes = reflexes;
        this.handling = handling;
    }

    // Genel güç hesaplaması
    public int getOverallStrength() {
        switch (position) {
            case "Kaleci":
                return calculateGoalkeeperStrength();
            case "Savunma":
                return calculateDefensiveStrength();
            case "Orta Saha":
                return calculateMidfieldStrength();
            case "Hücum":
                return calculateAttackingStrength();
            default:
                return 0;
        }
    }

    // Kaleci gücü hesaplaması
    private int calculateGoalkeeperStrength() {
        return (physical + mental + technical + goalkeeping) / 4;
    }

    // Savunma gücü hesaplaması
    private int calculateDefensiveStrength() {
        double specificAttributesWeight = 1.0;
        double generalAttributesWeight = 0.2;

        return (int) (
                (tackling * specificAttributesWeight) +
                        (marking * specificAttributesWeight) +
                        (physical * generalAttributesWeight) +
                        (mental * generalAttributesWeight) +
                        (technical * generalAttributesWeight)
        );
    }

    // Orta Saha gücü hesaplaması
    private int calculateMidfieldStrength() {
        double specificAttributesWeight = 1.0;
        double generalAttributesWeight = 0.2;

        return (int) (
                (passing * specificAttributesWeight) +
                        (dribbling * specificAttributesWeight) +
                        (physical * generalAttributesWeight) +
                        (mental * generalAttributesWeight) +
                        (technical * generalAttributesWeight)
        );
    }

    // Hücum gücü hesaplaması
    private int calculateAttackingStrength() {
        double specificAttributesWeight = 1.0;
        double generalAttributesWeight = 0.2;

        return (int) (
                (finishing * specificAttributesWeight) +
                        (heading * specificAttributesWeight) +
                        (physical * generalAttributesWeight) +
                        (mental * generalAttributesWeight) +
                        (technical * generalAttributesWeight)
        );
    }

    // Getter ve Setter metodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getTechnical() {
        return technical;
    }

    public void setTechnical(int technical) {
        this.technical = technical;
    }

    public int getGoalkeeping() {
        return goalkeeping;
    }

    public void setGoalkeeping(int goalkeeping) {
        this.goalkeeping = goalkeeping;
    }

    public int getTackling() {
        return tackling;
    }

    public void setTackling(int tackling) {
        this.tackling = tackling;
    }

    public int getMarking() {
        return marking;
    }

    public void setMarking(int marking) {
        this.marking = marking;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getReflexes() {
        return reflexes;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = reflexes;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }
}
