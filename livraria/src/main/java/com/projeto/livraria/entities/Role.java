package com.projeto.livraria.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    // Getters e setters

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Enum para valores de Role
    public enum Values {
        USER(2L),
        ADMIN(1L);

        long roleID;

        Values(long roleID) {
            this.roleID = roleID;
        }
    }


}
