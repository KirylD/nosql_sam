package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class BaseEntity {

	@Id
	private Integer id;

	private LocalDateTime created;

	private LocalDateTime modified;

	public void OnPersist() {
		created = LocalDateTime.now();
	}

	public void onUpdate() {
		modified = LocalDateTime.now();
	}
}
