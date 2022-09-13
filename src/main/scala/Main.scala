// Marvish Chandra

class MyMeeting():
  def MeetingSubject(subject, expectedAction):
    println(s"I have called this meeting because it is about: $subject . The purpose of this meeting is to do $expectedAction .")
  def MeetingLength(designatedRecorder,time):
    println(s"The meeting will be recorded by $designatedRecorder. The expected length of the meeting is $time.")
  def AverageTeam(firstRole,secondRole,thirdRole,fourthRole):
    println(s"What are your current assignments $firstRole, $secondRole, $thirdRole, and $fourthRole?")
  def DeadlinesReached(firstRole,secondRole,thirdRole,fourthRole):
    println(s"What are your finished deadlines $firstRole, $secondRole, $thirdRole, and $fourthRole?")
  def UpcomingDeadlines(firstRole,secondRole,thirdRole,fourthRole):
    println(s"What are your upcoming deadlines $firstRole, $secondRole, $thirdRole, and $fourthRole?")