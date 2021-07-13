package ex1;

/**
 * Pessoa
 */
public class Pessoa {
    private String name, adress, tel;

    public Pessoa(String name, String adress, String tel){
        this.name = name;
        this.adress = adress;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getName() + 
        "\nEndereço: " + getAdress() + 
        "\nTelefone: " + getTel();
    }
}