package ex1;

/**
 * IPessoa
 */
public interface IPessoa {
    boolean add(Pessoa p);
    Pessoa list(String name);
    boolean delete(String name);
    
}