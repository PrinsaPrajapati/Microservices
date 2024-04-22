package com.prinsa.microservices.company;

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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	private CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}

	@GetMapping
	public ResponseEntity<List<Company>> getAllCompanies() {
		return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addCompany(@RequestBody Company company) {

		companyService.createCompany(company);
		return new ResponseEntity<>("New Company Added Successfully!", HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable Long id) {

		Company company = companyService.getCompanyById(id);
		if (company != null) {
			return new ResponseEntity<>(company, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCompany(@PathVariable Long id) {

		boolean isdeleted = companyService.deleteCompany(id);
		if (isdeleted) {
			return new ResponseEntity<>("Company Deleted Successfully!", HttpStatus.OK);
		} else { 
			return new ResponseEntity<>("Company Not Found!",HttpStatus.NOT_FOUND);
		}
		
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateCompany(@PathVariable Long id, @RequestBody Company updatedCompany) {

		companyService.updateCompany(updatedCompany, id);

		return new ResponseEntity<>("Company updated Successfully!", HttpStatus.OK);

	}

}
