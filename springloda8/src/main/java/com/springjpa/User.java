package com.springjpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Mapping thông tin biến với tên cột trong Database
    @Column(name = "hp")
    private int hp;
    @Column(name = "stamina")
    private int stamina;

    // Nếu không đánh dấu @Column thì sẽ mapping tự động theo tên biến
    private int atk;
    private int def;
    private int agi;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public int getHp() {
//		return hp;
//	}
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//	public int getStamina() {
//		return stamina;
//	}
//	public void setStamina(int stamina) {
//		this.stamina = stamina;
//	}
//	public int getAtk() {
//		return atk;
//	}
//	public void setAtk(int atk) {
//		this.atk = atk;
//	}
//	public int getDef() {
//		return def;
//	}
//	public void setDef(int def) {
//		this.def = def;
//	}
//	public int getAgi() {
//		return agi;
//	}
//	public void setAgi(int agi) {
//		this.agi = agi;
//	}
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
    
}