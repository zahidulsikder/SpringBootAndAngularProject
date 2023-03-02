package org.idb.Tourism.service;

import org.idb.Tourism.entity.Booking;
import org.idb.Tourism.entity.Location;
import org.idb.Tourism.entity.Roomtype;
import org.idb.Tourism.repository.IBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
       @Autowired
    IBookingRepo iBookingRepo;
    public  void saveBook(Booking b){


        iBookingRepo.save(b);
    }

    public  void deleteBooking(int bId){
        iBookingRepo.deleteById(bId);
    }

    public List<Booking> getAllBooking(){
        return  iBookingRepo.findAll();

    }

    public Booking findBookingById(int bId){
        return iBookingRepo.findById(bId).get();
    }

    public void update(Booking b, int id){
        iBookingRepo.save(b);
    }


    public Booking findAllBookById(int id){
        return iBookingRepo.findById(id).get();
    }

}
