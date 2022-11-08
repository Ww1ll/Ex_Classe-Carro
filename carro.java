public class carro {

    public static void main(String args[]) {

        //método do compilador



        Carro carro1 = new Carro();

        carro1.setCor("Azul");

        carro1.setModelo("WRX");

        carro1.setFabricante("Subaru");

        carro1.setAno(2020);

        carro1.setPlaca("ABC-1313");

        carro1.setMarchaAtual(0);

        carro1.setVelAtual(0);



        System.out.println("A posição da memória é: " + carro1);

        System.out.println("A cor do carro é: " + carro1.getCor());



    }

    static class Carro{

        private String cor;

        private String fabricante;

        private String modelo;

        private int ano;

        private String placa;

        private int marcha_atual;

        private int vel_atual;

        // public int vel_atual;



        public Carro(){



        }





        public void setCor(String cor_nova){ //"pintando o carro"

            this.cor = cor_nova;

        }



        public String getCor(){ //"pegar a cor e retorna"

            return this.cor;

        }



        public void setFabricante(String fabricante_nova){

            this.fabricante = fabricante_nova;

        }



        public String getFabricante(){

            return this.fabricante;

        }



        public void setModelo(String modelo_novo){

            this.modelo = modelo_novo;

        }



        public String getModelo(){

            return this.modelo;

        }



        public void setPlaca(String placa_nova){

            this.placa = placa_nova;

        }



        public String getPlaca(){

            return this.placa;

        }



        public void setAno(int ano_novo){

            this.ano = ano_novo;

        }



        public int getAno(){

            return this.ano;

        }



        public void setMarchaAtual(int marcha_nova){

            this.marcha_atual = marcha_nova;

        }



        public int getMarchaAtual(){

            return this.marcha_atual;

        }



        public void setVelAtual(int vel_nova){

            this.vel_atual = vel_nova;

        }



        public int getVelAtual(){

            return this.vel_atual;

        }



        public int trocarMarcha(int marcha_desejada){

            this.marcha_atual = marcha_desejada; // 'this' pega da propria classe

            return this.marcha_atual;

            //super.   pega da classe de cima

        }



        public void acelerar(int km_acel){

            this.vel_atual += km_acel;



        }



        public void desacelerar(int km_acel){

            this.vel_atual -= km_acel;



        }

    }

}

