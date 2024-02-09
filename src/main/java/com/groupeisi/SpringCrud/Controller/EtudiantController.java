package com.groupeisi.SpringCrud.Controller;

import com.groupeisi.SpringCrud.Entity.Etudiant;
import com.groupeisi.SpringCrud.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
  @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
    @PostMapping
    public Etudiant createEtudiant (@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Integer id, @RequestBody Etudiant updatedEtudiant) {
        return etudiantService.updateEtudiant(id, updatedEtudiant);
    }
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Integer id) {
        etudiantService.deleteEtudiant(id);
    }
}


