package com.song.woo.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Memeber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;
	@Column
	private String id;
	@Column
	private String name;
	@Column
	private String pw;
	@Column
	private String otpKey;
}
