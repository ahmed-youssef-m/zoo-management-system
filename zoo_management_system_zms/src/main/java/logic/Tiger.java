 package logic;
 
 public class Tiger extends Animal {
    
        public Tiger() {
        }
        
         public Tiger(String info, String specie ,int cageno ,String name) {
            super(info, specie ,cageno,name);
        }
    
        @Override
        public void setInfo(String info) {
            this.info=info;
        }
    
        @Override
        public String getInfo() {
            return "The info : \n"
                   + "are African equines with distinctive black-and-white striped coats. There are \n"
            + "three living species: the Grévy's zebra (Equus grevyi), plains zebra (E. quagga),\n "
            + "and the mountain zebra (E. zebra). Zebras share the genus Equus with horses and asses\n ";
        }
    
        @Override
        public void setSpecie(String specie) {
          this.specie=specie;  
        }
    
        @Override
        public String getSpecie() {
            return "The specie of Tigers is : felines.\n";
        }
        @Override 
        public void setCageno(int cageno){
            this.cageno=cageno;
        }
    
        @Override 
        public int getCageno(){
            return 3;
        }
        
        @Override
        public void setName(String name) {
            this.name=name;
        }

        @Override
        public String getName() {
            
            return "Tiger";
        }
        
    }