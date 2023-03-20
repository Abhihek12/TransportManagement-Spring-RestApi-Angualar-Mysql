package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RestController
public class HomeController {
	
	@Autowired
	driverRepo drv;
	
	@Autowired
	recordsRepo rec;
	
	@Autowired
	vehicalRepo veh;
	
	
	@Autowired
	billRepo bills;
	
	
	@Autowired
	authRepo auth;
	
	
/******************************** vehical end poinrts **********************/
	

	//Add new vehical
			@PostMapping("/adddriver")
			@CrossOrigin(origins = "http://localhost:4200/driver")
			public int addDriver(@RequestBody driver d) {
				
				drv.save(d);		 		
				return 1;
			}
			
			
			@GetMapping("/getalldriver")
			@CrossOrigin(origins = "http://localhost:4200/driver")
			public List<driver> getAlldriver()
			{
				return drv.findAll();
			}
			
	//**************************************************************************
	
		
		//Add new vehical
		@PostMapping("/addVehical")
		@CrossOrigin(origins = "http://localhost:4200/vehical")
		public int addVehical(@RequestBody vehical v) {
			
			veh.save(v);		 		
			return 1;
		}
		
		
		
		
		//Delete employee by Id
		@DeleteMapping("/deletevehical/{id}")
		@CrossOrigin(origins = "http://localhost:4200/vehical")
		public void deleteveh(@PathVariable("id") Integer id) {
			veh.deleteById(id);
		}
		
		
		//Update employee
		@PutMapping("/updatevehical/{id}")
		@CrossOrigin(origins = "http://localhost:4200/vehical")
		public vehical updateRecords(@RequestBody vehical vh, @PathVariable int id) {
			
			vehical v = veh.findById(id).get();
			
			v.setId(vh.getId());
	        v.setVehicalno(vh.getVehicalno());
			v.setTax(vh.getTax());
			v.setFitness(vh.getFitness());
			v.setInsurance(vh.getInsurance());
			v.setPuc(vh.getPuc());
			v.setPermit(vh.getPermit());
			
			
			
			return veh.save(v);
		}
		
		
		//Get All employees
		@GetMapping("/getallveh")
		@CrossOrigin(origins = "http://localhost:4200/vehical")
		public List<vehical> getAllVeh()
		{
			return veh.findAll();
		}
		
		//Get employee by Id
		@GetMapping("/getvehbyid/{id}")
		@CrossOrigin(origins = "http://localhost:4200/")
		public vehical getVenById(@PathVariable int id) {
			return veh.findById(id).get();
		}
		
////////////////////////////////////////////////////////////////////////////
		
		//Update employee
		@PutMapping("/updaterecords/{id}")
		//@CrossOrigin(origins = "http://localhost:4200/record")
		public records updateRecords(@RequestBody records rc, @PathVariable int id) {
			
			records r = rec.findById(id).get();
			
			r.setId(rc.getId());
			r.setDateofload(rc.getDateofload());
			r.setTruck(rc.getTruck());
			r.setParticulars(rc.getParticulars());
			r.setRate(rc.getRate());
			r.setWeight(rc.getWeight());
			r.setAmount(rc.getAmount());
			r.setAdvance(rc.getAdvance());
			r.setKhoti(rc.getKhoti());
			r.setExtra(rc.getExtra());
			
			
			return rec.save(r);
		}
		
		//Delete employee by Id
		//@DeleteMapping("/deleteEmployeeByID/{id}")
		//@CrossOrigin(origins = "http://localhost:4200/")
		//public void deleteEmployeeById(@PathVariable("id") Integer id) {
		//	veh.deleteById(id);
		//}
	
		
		/****************************** driver endpoints ***************************/
		
		
		/****************************** records endpoints*************************/
		
		
		//Add new records
		
		
				@PostMapping("/addrecords")
				@CrossOrigin(origins = "http://localhost:4200/record")
				public int addRecords(@RequestBody records v) {					
					rec.save(v);		 		
					return 1;
				}
		
		/********************bill endpoints**************************/
		
				@GetMapping("/getallrec")
				@CrossOrigin(origins = "http://localhost:4200/record")
				public List<records> getAllRecords()
				{
					return rec.findAll();
				}
				
				@DeleteMapping("/deleterec/{id}")
				@CrossOrigin(origins = "http://localhost:4200/record")
				public void deleterec(@PathVariable("id") Integer id) {
					rec.deleteById(id);
				}
	
	
				/********************auth endpoints**************************/
				boolean a=false;
				@GetMapping("/findbyemail/{em}")
				@CrossOrigin(origins = "http://localhost:4200/login")
				public boolean getAllAuth(@PathVariable("em")String em)
				{
					System.out.println(em);
					
					auth.findAll().forEach(m->{
					
								if(m.getEmail().equals(em))
									a=true;}
								
							
							);
					
					if(a==true)
						return true;
					return false;
					
				}
				
				
				
				@PostMapping("/adduser")
				@CrossOrigin(origins = "http://localhost:4200/login")
				public int addUser(@RequestBody auth v) {					
					auth.save(v);		 		
					return 1;
				}
				
				//Get All employees
				@GetMapping("/getallauth")
				@CrossOrigin(origins = "http://localhost:4200/login")
				public List<auth> getAllauth()
				{
					return auth.findAll();
				}
				
				
				
				
				/********************bill endpoints**************************/
				
				@PostMapping("/addbillrec")
				@CrossOrigin(origins = "http://localhost:4200/billpdf")
				public int addbill(@RequestBody bill b) {					
					bills.save(b);		 		
					return 1;
				} 
				
				
				//Get All employees
				@GetMapping("/getallbill")
				@CrossOrigin(origins = "http://localhost:4200/billpdf")
				public List<bill> getallbill()
				{
					return bills.findAll();
				}
				
				
				@DeleteMapping("/deletebill/{id}")
				@CrossOrigin(origins = "http://localhost:4200/bill")
				public void deletebill(@PathVariable("id") Integer id) {
					bills.deleteById(id);
				}
			
				
				
				
				//Login
				@GetMapping("/login")
				@CrossOrigin(origins = "http://localhost:4200/login")
				public boolean checkuser(auth u)
				{
					
						auth v = auth.findAll().
						stream().
						filter(u1->(u1.getEmail().equals(u.getEmail()) && u1.getPassword().equals(u.getPassword())))
						.collect(Collectors.toList())
						.get(0);
								
						if(v != null)
							return true;
						
					return false;
						
				}
				
				
				
				/////////////////////////////////////////
				
				
				
				
				
				
}
