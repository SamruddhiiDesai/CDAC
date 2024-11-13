import { Router } from "express";
import { deleteProfile, getAllProfiles, saveProfile, updateProfile } from "../Controller/ProfilesController.js";


const profileRouter=Router();
profileRouter.post("/save",saveProfile);
profileRouter.get("/getAll",getAllProfiles);
profileRouter.put("/updateProfile",updateProfile);
profileRouter.delete("/deleteProfile",deleteProfile);

export default profileRouter;



