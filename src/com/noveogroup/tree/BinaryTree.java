package com.noveogroup.tree;

import com.noveogroup.exception.BinaryTreeException;
import com.noveogroup.exception.ElementAlreadyExistsException;
import com.noveogroup.exception.NoSuchTreeElementException;

import java.util.Iterator;

/**
 * Binary tree interface. Please add your exceptions to methods.
 */
public interface BinaryTree <K extends Comparable<? super K>,V> {
    void addElement(K key, V element) throws ElementAlreadyExistsException;
    void removeElement(K key) throws NoSuchTreeElementException;
    Iterator<V> getIterator();
}
