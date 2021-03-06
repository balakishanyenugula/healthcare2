package com.healthcare.f22b_9healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Service.MedicationService;
import com.healthcare.f22b_9healthcare.entity.Medication;

@RestController
@RequestMapping("Medication")
public class MedicationController {

	@Autowired
	private MedicationService medicationService;
	
    @PostMapping
    public void saveMedication(@RequestBody Medication medication) {
		medicationService.saveMedication(medication);
	}
	
    @PostMapping("/all")
	public void saveAllMedication(@RequestBody List<Medication> medications) {
		medicationService.saveAllMedication(medications);
	}
	
}
