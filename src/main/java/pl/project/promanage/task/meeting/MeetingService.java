package pl.project.promanage.task.meeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.email.Email;
import pl.project.promanage.task.email.EmailRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    public List<Meeting> getAllMeetings(){
        List<Meeting> dev = new ArrayList<>();
        meetingRepository.findAll().forEach(dev::add);
        return dev;
    }

    public List<Meeting> getAllMeetings2(){
        return meetingRepository.getAllMeetings2();
    }

    public Meeting getMeetings(Long id){
        return meetingRepository.findById(id).orElse(null);
    }

    public void addMeetings(Meeting dev){
        meetingRepository.save(dev);
    }

    public void updateMeetings(Meeting dev){
        meetingRepository.save(dev);
    }

    public void deleteMeetings(Long id){
        meetingRepository.deleteById(id);
    }
}
