package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GymManagementDTO;

public class GymManagementForm extends BaseForm { 
	
	@NotEmpty(message = "Member Id is required")
	private String memberId ;

	@NotEmpty(message = "Member Name is required")
	private String memberName ;

	@NotEmpty(message = "Trainer Name is required")
	private String  trainerName;

	@Min(1)
	@NotNull(message = "Membership Fee is required")
	private double membershipFee;

	@NotEmpty(message = "Workout Type is required")
	private String workoutType;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public double getMembershipFee() {
		return membershipFee;
	}

	public void setMembershipFee(double membershipFee) {
		this.membershipFee = membershipFee;
	}

	public String getWorkoutType() {
		return workoutType;
	}

	public void setWorkoutType(String workoutType) {
		this.workoutType = workoutType;
	}
	
	@Override
	public BaseDTO getDTO() {

		 GymManagementDTO dto = initDTO(new GymManagementDTO());
		
		 dto.setMemberName(memberName);
		 dto.setMemberId(memberId);
		 dto.setWorkoutType(workoutType);
		 dto.setTrainerName(trainerName);
		 dto.setMembershipFee(membershipFee);
		 return dto;
	}

}
