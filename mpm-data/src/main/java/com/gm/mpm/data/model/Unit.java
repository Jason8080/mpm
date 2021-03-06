package com.gm.mpm.data.model;

public class Unit {
    private Integer id;

    private String foreignKey;

    private String name;

    private Integer superior;

    public Unit(Integer id, String foreignKey, String name, Integer superior) {
        this.id = id;
        this.foreignKey = foreignKey;
        this.name = name;
        this.superior = superior;
    }

    public Unit() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey == null ? null : foreignKey.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSuperior() {
        return superior;
    }

    public void setSuperior(Integer superior) {
        this.superior = superior;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", foreignKey=").append(foreignKey);
        sb.append(", name=").append(name);
        sb.append(", superior=").append(superior);
        sb.append("]");
        return sb.toString();
    }
}