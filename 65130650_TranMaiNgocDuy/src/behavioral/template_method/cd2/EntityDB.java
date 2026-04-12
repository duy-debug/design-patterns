package behavioral.template_method.cd2;

import java.util.ArrayList;

public abstract class EntityDB<T> {
  ArrayList<T> entities = new ArrayList<>();
  public boolean add(T t) {
    //  Thêm đối tượng t vào danh sách list. Nếu thêm thành công trả về true, ngược lại trả  về false
    for (T entity : entities) {
      if (getKey(entity) == getKey(t)) {
        return false;
      }
    }
    entities.add(t);
    return true;
  }
    public int update (T t){
      // Tìm đối tượng o trong list có cùng key với t và cập nhật thông tin của t vào o.
      // Phương thức update trả về số lượng đối tượng được cập nhật.
      T temp = findByid(getKey(t));
      if (temp != null) {
        int index = entities.indexOf(temp);
        entities.set(index, t);
        return 1;
      }
      return 0;
    }
    public int delete (T t){
    T temp = findByid(getKey(t));
    if (temp != null) {
      entities.remove(temp);
      return 1;
      }
    return 0;
    }
    public T findByid ( int id){
    for (T entity : entities) {
      if (getKey(entity) == id) {
        return entity;
      }
    }
    return null;
  }
    public int deleteByKey ( int id){
      for (T entity : entities) {
        if (getKey(entity) == id) {
          entities.remove(entity);
          return 1;
        }
      }
      return 0;
    }
    abstract protected int getKey (T t);

}