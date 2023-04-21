# The U-Schema metamodel

U-Schema is a unified logical model that integrates the concepts and rules of both the relational model and the four most common NoSQL data models: columnar, document, graph, and key–value.

<figure>
    <img src="es.um.uschema/model/uschema.png" align="center"/>
</figure>
<br/>

The repository contains the following projects:

* `es.um.uschema`: The metamodel definition in an ecore file, and the generated java classes for this metamodel.
* `es.um.uschema.utils`: Utilities to handle U-Schema models easily, load and store models.
* `es.um.uschema.design`: A Sirius Viewpoint project to provide a visual representation of U-Schema models.

**A more detailed description about the metamodel can be found in the open-access paper: [A unified metamodel for NoSQL and relational databases](https://www.sciencedirect.com/science/article/pii/S0306437921001149).**
