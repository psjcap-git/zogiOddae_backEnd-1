package com.zerobase.leisure.domain.form;

import lombok.Getter;

@Getter
public class AddLeisureReviewForm {
	private Long customerId;
	private Long sellerId;
	private Long leisureId;

	private double rating;
	private String description;

	private String reply;
}
