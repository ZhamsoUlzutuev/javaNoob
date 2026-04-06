public class City {
    private String name;

    public City(String name){
        this.name = name;
    }

    public class Street{
        private String Sname;
        private String type;
        private double len;

        public Street(String sname, String type, double len) {
            this.Sname = sname;
            this.type = type;
            this.len = len;
        }

        @Override
        public String toString(){
            return type + " | " + Sname + " | " + len + "km" ;
        }


    }
    @Override
    public String toString(){
        return name;
    }


}
