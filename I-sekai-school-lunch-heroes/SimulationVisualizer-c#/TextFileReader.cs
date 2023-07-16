using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.IO;

public class TextFileReader : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject studentPrefab;
    StringReader stringReader;
    float repeating;
    int tick=0;
    string line = "";
    bool run = false;

    void Start()
    {
        for (int i = 1; i <= 14; i++)
        {
            for (int j = 1; j <= 35; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s1{0:00}{1:00}",i,j);
            }
        }
        for (int i = 1; i <= 14; i++)
        {
            for (int j = 1; j <= 33; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s2{0:00}{1:00}",i,j);
            }
        }
        for (int i = 1; i <= 13; i++)
        {
            for (int j = 1; j <= 31; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s3{0:00}{1:00}",i,j);
            }
        }

        TextAsset textFile = Resources.Load("log") as TextAsset;
        stringReader = new StringReader(textFile.text);
    }

    // Update is called once per frame
    void Update()   
    {
        if (Input.GetKey(KeyCode.Alpha7))
        {
            run = !run;
        }
        if (run)
        {
            repeating += Time.deltaTime;
            if (repeating >= 0.5f)
            {
                while (true)
                {
                    line = stringReader.ReadLine();
                    if (line == null) return;

                    string location = line.Split(':')[0];
                    string student = line.Split(':')[1];
                    if (location.Equals("t")) break;

                    GameObject locationObject = GameObject.Find(location);
                    GameObject studentObject = GameObject.Find(string.Format("s{0}", student));

                    float x = Random.Range(locationObject.transform.position.x - 5f, locationObject.transform.position.x + 5f);
                    float z = Random.Range(locationObject.transform.position.z - 5f, locationObject.transform.position.z + 5f);

                    studentObject.transform.position = new Vector3(x, locationObject.transform.position.y, z);
                }
                repeating = 0;
                Debug.Log(tick);
                tick++;
            }
        }
    }
}
