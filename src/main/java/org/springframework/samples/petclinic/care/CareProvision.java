package org.springframework.samples.petclinic.care;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "care_provision")
public class CareProvision extends BaseEntity{   
    
	@NotNull
	@PositiveOrZero
	@Column(name = "duration")
	double duration;
	
	@ManyToOne(optional = true)
	Visit visit;
    
    @ManyToOne(optional = false)
    @NotNull
    Care care;   
}
