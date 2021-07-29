package ex1;

import java.util.ArrayList;

/**
 * MPessoa
 */
public class MPessoa implements IPessoa{

    ArrayList <Pessoa> persons = new ArrayList<Pessoa>();

    @Override
    public boolean add(Pessoa p){
        if(p != null){
            persons.add(p);
            return true;
        }else{
            throw new IllegalArgumentException("Pessoa inválida para cadastro!");
        }
        
    }

    @Override
    public Pessoa list(String name){
        if(!persons.isEmpty()){
            for(Pessoa p : persons){
                if(p.getName().equalsIgnoreCase(name)){
                    return p;
                }
            }
        }
        throw new IllegalArgumentException("Pessoa não cadastrada.");
    }

    @Override
    public boolean delete(String name){
        for(Pessoa p : persons){
            if(p.getName().equalsIgnoreCase(name)){
                persons.remove(p);
                return true;
            }
        }
        throw new IllegalArgumentException("Pessoa não cadastrada.");
    } 
}