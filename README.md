# Enoncé
<pre>
1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
2. Créer l'entité JPA Compte
3. Créer l'interface CompteRepository basée sur Spring Data
4. Tester la couche DAO
5. Créer le Web service Restfull qui permet de gérer des comptes
6. Tester le web micro-service en utilisant un client REST comme Postman
7. Générer et tester le documentation Swagger de des API Rest du Web service
8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
9. Créer les DTOs et Mappers
10. Créer la couche Service (métier) et du micro service
</pre>


1-

![image](https://user-images.githubusercontent.com/85403056/229936351-a7e558cc-a4f1-478f-a0af-3c509b13eda3.png)


![image](https://user-images.githubusercontent.com/85403056/229936224-46113131-c53d-4eb0-9ff2-20c09e42d46c.png)


4-

![image](https://user-images.githubusercontent.com/85403056/229936703-edeb1339-b028-40d3-9b04-810949cd04f1.png)


6- Postman

* <h4>Test de methode Get All Accounts :</h4>

![image](https://user-images.githubusercontent.com/85403056/229941784-db66a91b-67fd-4082-97f3-76c550ce137d.png)

* <h4>Test de methode Find Account By Id :</h4>

![image](https://user-images.githubusercontent.com/85403056/229941870-87878206-41ef-4ad3-a74e-d1f06901d428.png)

* <h4>Test de methode Save Account :</h4>

![image](https://user-images.githubusercontent.com/85403056/229945826-ff353332-e725-4dc1-8f2d-23919dca9f1a.png)

![image](https://user-images.githubusercontent.com/85403056/229946086-a5a82832-c9f9-40fe-88a0-79edfb82f8d2.png)

* <h4>Test de methode Update Account :</h4>

![image](https://user-images.githubusercontent.com/85403056/229946573-168b5579-24ef-4611-9602-396a08b74fcd.png)

* <h4>Test de methode Delete Account :</h4>

![image](https://user-images.githubusercontent.com/85403056/229947557-aa552cb4-7b79-482b-bdfa-872b7fa83175.png)

7- Swagger

![image](https://user-images.githubusercontent.com/85403056/229950046-3f663d0a-38fb-467a-9631-15eda82c24c3.png)


![image](https://user-images.githubusercontent.com/85403056/229950008-e3c44ba5-4c64-489f-b19a-e7b51c521d0d.png)


![image](https://user-images.githubusercontent.com/85403056/229951020-461d6add-c32a-4a4d-9da1-567fa90b2592.png)

![image](https://user-images.githubusercontent.com/85403056/229951334-7fbf562d-e311-4b8f-8008-cd0f78019ec5.png)



8- @RepositoryRestResource

![image](https://user-images.githubusercontent.com/85403056/229953193-af3fdd2e-fd4d-445e-96a7-07a21d6fd6a4.png)

![image](https://user-images.githubusercontent.com/85403056/229953436-8ce61f75-472c-4748-8ede-8c112c48d8d5.png)

Projections 

![image](https://user-images.githubusercontent.com/85403056/229954225-bb7aa2b2-0601-4f6e-80ae-be864ef6d1f9.png)

GraphQL 

![image](https://user-images.githubusercontent.com/85403056/230106326-1b7d4b91-5945-45ea-b099-e658d50a113b.png)

![image](https://user-images.githubusercontent.com/85403056/230110241-b8092ecb-1c1e-4ab9-b5f4-2ef39b6468bf.png)

![image](https://user-images.githubusercontent.com/85403056/230127358-71330ae6-5f99-4902-8140-88421c6847e1.png)

![image](https://user-images.githubusercontent.com/85403056/230128753-b1c146a7-0255-442f-ada1-0f7ab23da798.png)

![image](https://user-images.githubusercontent.com/85403056/230133700-e5fbd74b-d847-46b7-aa64-144b207f6510.png)

![image](https://user-images.githubusercontent.com/85403056/230174258-dced7211-46ed-445d-b4bf-87ff71d4e885.png)

