import { createConnection } from "mysql2";

export function createConnectionObject(){
   return createConnection({    //it returns configuration objects   
        host:"localhost",
        user:"samruddhi",
        password:"cdac",
        database:"sandbox"
    });
    
}

//establishconnection
export function establishconnection(){
    createConnectionObject().connect((error)=>{
        if(error){
            console.log(error);
        }else{
            console.log("connected to database");
        }
    });
}