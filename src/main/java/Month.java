public enum Month {

    JAN(31, Seasons.WINTER){
        @Override
        public String toString(){
            return String.format("Season(name=%s, days=%d, season=%s)", this.name(), this.days, this.getSeason().toString());
        }
    },
    FEB(30, Seasons.WINTER),
    JUL(31, Seasons.SUMMER),
    SEP(31, Seasons.FALL);

    public int days;
    private Seasons season;

    public Seasons getSeason(){
        return this.season;
    }

    Month(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    @Override
    public String toString(){
        return String.format("Season[name=%s, days=%d, season=%s]", this.name(), this.days, this.getSeason().toString());
    }
}
