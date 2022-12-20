export class persona{
    id?: number;
    nombre:string;
    apellido:string;
    dni:string;
    telefono:string;
    email:string;

    constructor(nombre:string, apellido:string, dni:string, telefono:string, email:string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }
}