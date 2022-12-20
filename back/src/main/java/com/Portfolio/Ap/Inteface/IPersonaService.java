package com.Portfolio.Ap.Inteface;

import com.Portfolio.Ap.Entity.Persona;
import java.util.List;

public interface IPersonaService {
 //Traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un obj de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un obj por id
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
