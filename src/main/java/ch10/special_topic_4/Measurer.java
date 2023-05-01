package ch10.special_topic_4;

/**
   Describes any class whose objects can measure other objects.
*/
public interface Measurer
{
   /**
      Computes the measure of an object.
      @param anObject the object to be measured
      @return the measure
   */
   double measure(Object anObject);
}

