package pl.project.promanage.task.meeting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.email.Email;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MeetingController {


    @Autowired
    private MeetingService meetingService;

    @GetMapping("/meetings")
    public List<Meeting> getAllMeetings(){
        return meetingService.getAllMeetings();
    }

    @GetMapping("/project-meetings")
    public List<Meeting> getAllMeetings2(){
        return meetingService.getAllMeetings2();
    }

    @GetMapping("/meetings/{id}")
    public Meeting getMeetings(@PathVariable Long id){
        return meetingService.getMeetings(id);
    }

    @PutMapping("/meetings/{id}")
    public void updateMeetings(@RequestBody Meeting dev, @PathVariable Long id){
        meetingService.updateMeetings(dev);
    }

    @PostMapping("/meetings")
    public void createMeetings(@RequestBody Meeting dev){
        meetingService.addMeetings(dev);
    }

    @DeleteMapping("/meetings/{id}")
    public void deleteMeetings(@PathVariable Long id){
        meetingService.deleteMeetings(id);
    }

}
