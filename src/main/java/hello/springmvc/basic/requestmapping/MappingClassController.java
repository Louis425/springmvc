package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {


//  회원 전채 조회 GET mapping/users
    @GetMapping
    public String users() {
        return "get users";
    }

//  회원 가입 POST /mapping/users
    @PostMapping
    public String addUser() {
        return "post users";
    }

//  화원 조회 GET /mapping/users/{userId}
    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId) {
        return "get userId=" + userId;
    }

    //  회원 수정 PATCH /mapping/users/{userId}
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId) {
        return "update userId= " + userId;
    }

//  회원 삭제 DELETE /mapping/users/{userId}
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId) {
        return "delete userId= " + userId;
    }

}
