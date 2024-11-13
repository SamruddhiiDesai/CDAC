import express from 'express';
import cors from "cors";  //allow all req from client
import { establishconnection } from './src/config/Dbconfig.js';
import bodyParser from 'body-parser';
import profileRouter from './src/Router/ProfilesRouter.js';
const app=express();
app.use(cors());  //as middleware we access 
app.use(express.json());
//app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use('/api',profileRouter);

app.listen(4050,()=>{
    console.log("server runnig on port 4050");
    establishconnection();
});