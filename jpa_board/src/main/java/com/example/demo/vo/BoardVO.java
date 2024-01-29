package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="board")
public class BoardVO {
	@Id
	private int no;
	
	private String title;
	private String writer;
	private String pwd;
	private String content;
	private String regdate;
	private int hit;
	private String fname;
	private int b_ref;
	private int b_level;
	private int b_step;
}
