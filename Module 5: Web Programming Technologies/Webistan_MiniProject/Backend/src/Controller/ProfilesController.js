// import { createConnectionObject } from '../config/Dbconfig.js';

// const connection = createConnectionObject();

// //  save a profile 
// export function saveProfile(req, res) {
//     try {
//         //const data=JSON.parse(req.body.data);
//         console.log(req.body);
//         const { title, author, description, githubLink, technologiesUsed, languageUsed } = req.body;
//         const insertQry = `INSERT INTO Profile (title, author, description, githubLink, technologiesUsed, languageUsed)
//                            VALUES ('${title}', '${author}', '${description}', '${githubLink}', '${technologiesUsed}', '${languageUsed}')`;

//         connection.query(insertQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(201).send({ message: "Profile saved successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// //  get all profiles from the database
// export function getAllProfiles(req, res) {
//     try {
//         const selectQry = 'SELECT * FROM Profile';
//         connection.query(selectQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
                
//                 res.status(200).send(JSON.stringify(result)); // Send the results as a JSON response
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// //  update a profile in the database
// export function updateProfile(req, res) {
//     try {
//         const { id, title, author, description, githubLink, technologiesUsed, languageUsed, imageUrl } = req.body;
//         const updateQry = `UPDATE Profile
//                            SET title = '${title}', author = '${author}', description = '${description}', githubLink = '${githubLink}',
//                                technologiesUsed = '${technologiesUsed}', languageUsed = '${languageUsed}', imageUrl = '${imageUrl}'
//                            WHERE id = ${id}`;

//         connection.query(updateQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile updated successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// //  delete a profile from the database
// export function deleteProfile(req, res) {
//     try {
//         const { id } = req.body;
//         const deleteQry = `DELETE FROM Profile WHERE id = ${id}`;

//         connection.query(deleteQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile deleted successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// import { createConnectionObject } from '../config/Dbconfig.js';

// const connection = createConnectionObject();

// export function saveProfile(req, res) {
//     try {
//         const { title, author, description, githubLink, technologiesUsed, languageUsed } = req.body;
//         const insertQry = `INSERT INTO Profile (title, author, description, githubLink, technologiesUsed, languageUsed,imageUrl)
//                            VALUES ('${title}', '${author}', '${description}', '${githubLink}', '${technologiesUsed}', '${languageUsed}')`;

//         connection.query(insertQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(201).send({ message: "Profile saved successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function getAllProfiles(req, res) {
//     try {
//         const selectQry = 'SELECT * FROM Profile';
//         connection.query(selectQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send(JSON.stringify(result));
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function updateProfile(req, res) {
//     try {
//         const { id, title, author, description, githubLink, technologiesUsed, languageUsed, imageUrl } = req.body;
//         const updateQry = `UPDATE Profile
//                            SET title = '${title}', author = '${author}', description = '${description}', githubLink = '${githubLink}',
//                                technologiesUsed = '${technologiesUsed}', languageUsed = '${languageUsed}', imageUrl = '${imageUrl}'
//                            WHERE id = ${id}`;

//         connection.query(updateQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile updated successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function deleteProfile(req, res) {
//     try {
//         const { id } = req.body;
//         const deleteQry = `DELETE FROM Profile WHERE id = ${id}`;

//         connection.query(deleteQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile deleted successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

//-----------------------------------------------------------------------------------------------------------------

// import { createConnectionObject } from '../config/Dbconfig.js';

// const connection = createConnectionObject();

// export function saveProfile(req, res) {
//     try {
//         const { title, author, description, githubLink, technologiesUsed, languageUsed } = req.body;
//         const insertQry = `INSERT INTO Profile (title, author, description, githubLink, technologiesUsed, languageUsed)
//                            VALUES ('${title}', '${author}', '${description}', '${githubLink}', '${technologiesUsed}', '${languageUsed}')`;

//         connection.query(insertQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(201).send({ message: "Profile saved successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function getAllProfiles(req, res) {
//     try {
//         const selectQry = 'SELECT * FROM Profile';
//         connection.query(selectQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send(JSON.stringify(result));
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function updateProfile(req, res) {
//     try {
//         const { id, title, author, description, githubLink, technologiesUsed, languageUsed, imageUrl } = req.body;
//         const updateQry = `UPDATE Profile
//                            SET title = '${title}', author = '${author}', description = '${description}', githubLink = '${githubLink}',
//                                technologiesUsed = '${technologiesUsed}', languageUsed = '${languageUsed}', imageUrl = '${imageUrl}'
//                            WHERE id = ${id}`;

//         connection.query(updateQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile updated successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }

// export function deleteProfile(req, res) {
//     try {
//         const { id } = req.body;
//         const deleteQry = `DELETE FROM Profile WHERE id = ${id}`;

//         connection.query(deleteQry, (error, result) => {
//             if (error) {
//                 console.log(error);
//                 res.status(500).send({ message: "Something went wrong" });
//             } else {
//                 res.status(200).send({ message: "Profile deleted successfully" });
//             }
//         });
//     } catch (error) {
//         console.log(error);
//         res.status(500).send({ message: "Something went wrong" });
//     }
// }
//-----------------------------------------------------------------------------------------------------------------



import { createConnectionObject } from '../config/Dbconfig.js';

const connection = createConnectionObject();

export function saveProfile(req, res) {
    try {
        const { title, author, description, githubLink, technologiesUsed, languageUsed,imageUrl } = req.body;
        const insertQry = `INSERT INTO Profile (title, author, description, githubLink, technologiesUsed, languageUsed,imageUrl)
                           VALUES ('${title}', '${author}', '${description}', '${githubLink}', '${technologiesUsed}', '${languageUsed}','${imageUrl}')`;

        connection.query(insertQry, (error, result) => {
            if (error) {
                console.log(error);
                res.status(500).send({ message: "Something went wrong" });
            } else {
                res.status(201).send({ message: "Profile saved successfully" });
            }
        });
    } catch (error) {
        console.log(error);
        res.status(500).send({ message: "Something went wrong" });
    }
}

export function getAllProfiles(req, res) {
    try {
        const selectQry = 'SELECT * FROM Profile';
        connection.query(selectQry, (error, result) => {
            if (error) {
                console.log(error);
                res.status(500).send({ message: "Something went wrong" });
            } else {
                res.status(200).send(JSON.stringify(result));
            }
        });
    } catch (error) {
        console.log(error);
        res.status(500).send({ message: "Something went wrong" });
    }
}

export function updateProfile(req, res) {
    try {
        const { id, title, author, description, githubLink, technologiesUsed, languageUsed, imageUrl } = req.body;
        const updateQry = `UPDATE Profile
                           SET title = '${title}', author = '${author}', description = '${description}', githubLink = '${githubLink}',
                               technologiesUsed = '${technologiesUsed}', languageUsed = '${languageUsed}', imageUrl = '${imageUrl}'
                           WHERE id = ${id}`;

        connection.query(updateQry, (error, result) => {
            if (error) {
                console.log(error);
                res.status(500).send({ message: "Something went wrong" });
            } else {
                res.status(200).send({ message: "Profile updated successfully" });
            }
        });
    } catch (error) {
        console.log(error);
        res.status(500).send({ message: "Something went wrong" });
    }
}

export function deleteProfile(req, res) {
    try {
        const { id } = req.body;
        const deleteQry = `DELETE FROM Profile WHERE id = ${id}`;

        connection.query(deleteQry, (error, result) => {
            if (error) {
                console.log(error);
                res.status(500).send({ message: "Something went wrong" });
            } else {
                res.status(200).send({ message: "Profile deleted successfully" });
            }
        });
    } catch (error) {
        console.log(error);
        res.status(500).send({ message: "Something went wrong" });
    }
}