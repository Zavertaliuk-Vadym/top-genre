package interlink.controller;

import interlink.model.Comments;
import interlink.model.Movie;
import interlink.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/comm")
public class CommentsController {
    @Autowired
    CommentsService commentsService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    List<Comments> home() {
        return commentsService.getAllComm();
    }
}
