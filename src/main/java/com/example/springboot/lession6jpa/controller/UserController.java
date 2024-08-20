package com.example.springboot.lession6jpa.controller;

import com.example.springboot.lession6jpa.dto.PagingCustomDTO;
import com.example.springboot.lession6jpa.dto.UserDTO;
import com.example.springboot.lession6jpa.model.UserRequest;
import com.example.springboot.lession6jpa.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list-all")
    public ResponseEntity<List<UserDTO>> findAllUsers() {
        var result = userService.findAllUsers();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/filter")
    @Operation(summary = "List user follow filter")
    public ResponseEntity<List<UserDTO>> findAllUsersByFilter(@RequestParam(name = "hp", required = false) Integer hp,
                                                              @RequestParam(name = "atk", required = false) Integer atk) {
        var result = userService.findAllUsersByFilter(hp, atk);
        return ResponseEntity.ok(result);

    }

    @GetMapping(value = "/paging", params = {"page", "size"})
    @Operation(summary = "List user follow filter")
    public ResponseEntity<PagingCustomDTO> findPagingUsers(@RequestParam(defaultValue = "0") int page,
                                                           @RequestParam(defaultValue = "5") int size,
                                                           @RequestParam(name = "hp", required = false) Integer hp,
                                                           @RequestParam(name = "atk", required = false) Integer atk) {
        var result = userService.findAllUsersByFilterPaging(page, size, hp, atk);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/add-new")
    @Operation(summary = "This API for adding new user")
    public ResponseEntity<?> addNewUser(@RequestBody UserRequest payload) throws URISyntaxException {
        userService.addNewUser(payload);
        return ResponseEntity.created(new URI("/app/v1/user/add-new")).build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "This API for edit a record")
    public ResponseEntity<Void> editUser(@PathVariable Long id,
                                         @RequestBody UserRequest payload) throws URISyntaxException {
        userService.editUser(id, payload);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "This API for delete a record")
    ResponseEntity<Void> deleteUser(@PathVariable Long id) throws URISyntaxException {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();

    }


}
