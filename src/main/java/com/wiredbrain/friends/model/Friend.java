package com.wiredbrain.friends.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("first-name")
    @NotBlank
    private String firstName;

    @JsonProperty("last-name")
    private String lastName;

    int age;

    @JsonIgnore
    boolean married;

//    @Embedded
//    Address address;

    //@JsonManagedReference
    //@OneToMany(mappedBy = "friend", cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    List<Address> addresses;



    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean isMarried() { return married; }
    public void setMarried(boolean married) { this.married = married; }

//    public Address getAddress() { return address; }
//    public void setAddress(Address address) { this.address = address; }


    public List<Address> getAddresses() { return addresses; }
    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }
}