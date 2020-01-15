package com.kurguzov.DAO;

import com.kurguzov.Entities.CitiesEntity;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface CitiesDAO {
    void add(CitiesEntity city)throws SQLException,ClassNotFoundException, SAXException, IOException, ParserConfigurationException;
    CitiesEntity getById(int id)throws SQLException,ClassNotFoundException,SAXException,IOException,ParserConfigurationException;
    void update(CitiesEntity city)throws SQLException,ClassNotFoundException,SAXException,IOException,ParserConfigurationException;
    void delete(int id)throws SQLException,ClassNotFoundException,SAXException,IOException,ParserConfigurationException;
    List<CitiesEntity> getAll()throws SQLException,ClassNotFoundException,SAXException,IOException,ParserConfigurationException;
}