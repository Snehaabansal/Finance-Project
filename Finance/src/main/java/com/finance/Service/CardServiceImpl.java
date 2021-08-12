package com.finance.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.Model.Carddetails;
import com.finance.Model.Userdetails;
import com.finance.Repository.CardRepository;



@Service
@Transactional

public class CardServiceImpl implements CardService {
	@Autowired
	CardRepository crdRepo;

	@Override
	public List<Carddetails> getCarddetails() {
		// TODO Auto-generated method stub
		return crdRepo.findAll();
	}

	@Override
	public boolean updateCard(int regid) {
		Carddetails newcrd=crdRepo.findById(regid).get();
		crdRepo.save(newcrd);
		return true;
		
		
	}

	@Override
	public Carddetails findCard(int regid) {
		// TODO Auto-generated method stub
		return crdRepo.findById(regid).get();
	}

	@Override
	public boolean deleteCard(int regid) {
		// TODO Auto-generated method stub
		Carddetails newusr=crdRepo.findById(regid).get();
		crdRepo.delete(newusr);
		return true;
	}

	@Override
	public boolean addCard(Carddetails card) {
		// TODO Auto-generated method stub
		crdRepo.save(card);
		return true;}

	

}


