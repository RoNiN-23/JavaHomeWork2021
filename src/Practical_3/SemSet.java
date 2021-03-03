package Practical_3;

import java.util.*;
import java.util.concurrent.Semaphore;


public class SemSet<E> implements Set<E> {
    private final Set<E> set = new HashSet<>();
    private final Semaphore semaphore = new Semaphore(1, true);
    @Override
    public int size() {
        int value = 0;
        try {
            semaphore.acquire();
            value = set.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean contains(Object o) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> value = null;
        try {
            semaphore.acquire();
            value = set.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public Object[] toArray() {
        Object[] value = new Object[]{};
        try {
            semaphore.acquire();
            value = set.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] value = new Object[]{};
        try {
            semaphore.acquire();
            value = set.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (T[]) value;
    }

    @Override
    public boolean add(E e) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.add(e);
            semaphore.release();
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean remove(Object o) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = set.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "SemSet{" + set +
                '}';
    }
}