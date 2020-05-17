# springbootWithEmbeddedMongoDB
- This is an example of Spring boot integration with Embedded MongoDB.
## Explanation
- The Spring boot is integrated with MongoDB. To perform the CRUD operation, ***embedded MongoDB*** is used.
- The ***Department*** is the collection which embedded ***Student*** and ***HeadOfTheDepartment*** details. 
- **You can also download the Mongodb and little bit modification in application.yml file will work for you.**

## Steps to test the application

- If you want to save new Department details, then hit the below URL with method body,


     **http://localhost:8080/saveDepartment**

   ```
      {
        "id": 2,
        "name":"Chemistry",
        "strength":50,
        "student":[{
          "id": 1001,
          "name":"Simona Huge",
          "address":"20th Street, New Jersey"
          },
          {
            "id": 1002,
            "name":"Huge Hungman",
            "address":"20th Street, New Jersey"	
          }],
        "hod":{
          "id": 10002,
          "name":"Epicso Mule",
          "address":"20th Street, New Jersey"
        }
      }
       
    
    
- If you want to retrieve Department details with ***ID*** then hit the 1st URL and hit the 2nd URL if you want to fetch using Department ***name***.


    - 1 **http://localhost:8080/getDepartment/2**
    
    - 2 **http://localhost:8080/findDepartmentByName/Chemistry**

