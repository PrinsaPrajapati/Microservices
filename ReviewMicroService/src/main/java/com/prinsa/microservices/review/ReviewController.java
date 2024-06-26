package com.prinsa.microservices.review;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}

	@GetMapping
	public ResponseEntity<List<Review>> getAllCompanies(@RequestParam Long companyId) {
		return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addReview(@RequestParam Long companyId, @RequestBody Review review) {

		boolean isReviewed = reviewService.addReview(companyId, review);
		if (isReviewed) {
			return new ResponseEntity<>("Review Added Successfully!", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Review not Saved!", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/{reviewId}")
	public ResponseEntity<Review> getReview(@PathVariable Long reviewId) {
		return new ResponseEntity<>(reviewService.getReview(reviewId), HttpStatus.OK);

	}

	@PutMapping("/{reviewId}")
	public ResponseEntity<String> updateReview(@PathVariable Long reviewId, @RequestBody Review review) {

		boolean isReviewUpdated = reviewService.updateReview(reviewId, review);
		if (isReviewUpdated) {
			return new ResponseEntity<>("Review updated Successfully!", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Review not updated", HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{reviewId}")
	public ResponseEntity<String> deleteCompany(@PathVariable Long reviewId) {

		boolean isdeleted = reviewService.deleteReview(reviewId);
		if (isdeleted) {
			return new ResponseEntity<>("Review Deleted Successfully!", HttpStatus.OK);
		} else { 
			return new ResponseEntity<>("Review Not Found!",HttpStatus.NOT_FOUND);
		}
	}
}
